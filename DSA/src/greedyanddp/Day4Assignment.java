package greedyanddp;

import java.util.*;

/**
 * Day 4 Assignment: Greedy and Dynamic Programming
 * Single file, single public class, using static nested classes.
 */
public class Day4Assignment {

    public static void main(String[] args) {

        System.out.println("===== PART A: DP Fundamentals =====");
        PartA.DPTheory.printNotes();
        PartA.FibonacciDP.demo();

        System.out.println("\n===== PART B: Core DP Problems =====");
        PartB.Knapsack01.demo();
        PartB.LCS.demo();
        PartB.CoinChangeMin.demo();
        PartB.RodCutting.demo();

        System.out.println("\n===== PART C: Greedy Fundamentals =====");
        PartC.GreedyTheory.printNotes();

        System.out.println("\n===== PART D: Core Greedy Algorithms =====");
        PartD.ActivitySelection.demo();
        PartD.FractionalKnapsack.demo();
        PartD.HuffmanCoding.demo();
        PartD.PrimsMST.demo();
        PartD.JobSchedulingDeadlines.demo();
    }

    // ============================= PART A =============================
    static class PartA {

        static class DPTheory {
            static void printNotes() {
                System.out.println("Dynamic Programming (DP): solves problems by storing results of subproblems.");
                System.out.println("Recursion: may recompute same subproblems multiple times (slow).");
                System.out.println("DP Properties:");
                System.out.println("1) Overlapping Subproblems: same subproblems repeat (e.g., Fibonacci).");
                System.out.println("2) Optimal Substructure: optimal solution built from optimal subsolutions (e.g., knapsack).");
            }
        }

        static class FibonacciDP {

            // Memoization (Top-Down)
            static int fibMemo(int n, int[] dp) {
                if (n <= 1) return n;
                if (dp[n] != -1) return dp[n];
                return dp[n] = fibMemo(n - 1, dp) + fibMemo(n - 2, dp);
            }

            // Tabulation (Bottom-Up)
            static int fibTab(int n) {
                if (n <= 1) return n;
                int[] dp = new int[n + 1];
                dp[0] = 0; dp[1] = 1;
                for (int i = 2; i <= n; i++) dp[i] = dp[i - 1] + dp[i - 2];
                return dp[n];
            }

            static void demo() {
                int n = 10;
                int[] dp = new int[n + 1];
                Arrays.fill(dp, -1);

                System.out.println("\nFibonacci DP Demo:");
                System.out.println("F(" + n + ") using Memoization = " + fibMemo(n, dp));
                System.out.println("F(" + n + ") using Tabulation   = " + fibTab(n));
            }
        }
    }

    // ============================= PART B =============================
    static class PartB {

        // --------------- 0/1 Knapsack ---------------
        static class Knapsack01 {

            // O(n*W) time, O(n*W) space
            static int knapsack2D(int[] wt, int[] val, int W) {
                int n = wt.length;
                int[][] dp = new int[n + 1][W + 1];

                for (int i = 1; i <= n; i++) {
                    for (int cap = 0; cap <= W; cap++) {
                        dp[i][cap] = dp[i - 1][cap]; // not take
                        if (wt[i - 1] <= cap) {
                            dp[i][cap] = Math.max(dp[i][cap],
                                    val[i - 1] + dp[i - 1][cap - wt[i - 1]]);
                        }
                    }
                }
                return dp[n][W];
            }

            // O(n*W) time, O(W) space
            static int knapsack1D(int[] wt, int[] val, int W) {
                int[] dp = new int[W + 1];
                for (int i = 0; i < wt.length; i++) {
                    for (int cap = W; cap >= wt[i]; cap--) {
                        dp[cap] = Math.max(dp[cap], val[i] + dp[cap - wt[i]]);
                    }
                }
                return dp[W];
            }

            static void demo() {
                int[] wt = {2, 3, 4, 5};
                int[] val = {3, 4, 5, 6};
                int W = 5;

                System.out.println("\n0/1 Knapsack DP Demo:");
                System.out.println("Max Value (2D DP) = " + knapsack2D(wt, val, W));
                System.out.println("Max Value (1D DP) = " + knapsack1D(wt, val, W));
                System.out.println("Time: O(n*W). Space: 2D->O(n*W), Optimized->O(W).");
            }
        }

        // --------------- LCS ---------------
        static class LCS {

            static String lcs(String a, String b) {
                int n = a.length(), m = b.length();
                int[][] dp = new int[n + 1][m + 1];

                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= m; j++) {
                        if (a.charAt(i - 1) == b.charAt(j - 1)) dp[i][j] = 1 + dp[i - 1][j - 1];
                        else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                }

                // reconstruct
                StringBuilder sb = new StringBuilder();
                int i = n, j = m;
                while (i > 0 && j > 0) {
                    if (a.charAt(i - 1) == b.charAt(j - 1)) {
                        sb.append(a.charAt(i - 1));
                        i--; j--;
                    } else if (dp[i - 1][j] >= dp[i][j - 1]) i--;
                    else j--;
                }
                return sb.reverse().toString();
            }

            static void demo() {
                String a = "ABCBDAB";
                String b = "BDCABA";
                System.out.println("\nLCS DP Demo:");
                System.out.println("String A: " + a);
                System.out.println("String B: " + b);
                System.out.println("LCS = " + lcs(a, b));
                System.out.println("Time: O(n*m). Space: O(n*m).");
            }
        }

        // --------------- Coin Change (Min Coins) ---------------
        static class CoinChangeMin {

            static int minCoins(int[] coins, int amount) {
                int INF = amount + 1;
                int[] dp = new int[amount + 1];
                Arrays.fill(dp, INF);
                dp[0] = 0;

                for (int a = 1; a <= amount; a++) {
                    for (int c : coins) {
                        if (a - c >= 0) dp[a] = Math.min(dp[a], dp[a - c] + 1);
                    }
                }
                return dp[amount] == INF ? -1 : dp[amount];
            }

            static void demo() {
                int[] coins = {1, 3, 4};
                int amount = 6;
                System.out.println("\nCoin Change (Min Coins) DP Demo:");
                System.out.println("Coins: " + Arrays.toString(coins) + ", Amount: " + amount);
                System.out.println("Min Coins = " + minCoins(coins, amount));
                System.out.println("Time: O(amount*n). Space: O(amount).");
            }
        }

        // --------------- Rod Cutting ---------------
        static class RodCutting {

            static int maxProfit(int[] price, int n) {
                int[] dp = new int[n + 1];
                dp[0] = 0;

                for (int len = 1; len <= n; len++) {
                    int best = 0;
                    for (int cut = 1; cut <= len; cut++) {
                        best = Math.max(best, price[cut - 1] + dp[len - cut]);
                    }
                    dp[len] = best;
                }
                return dp[n];
            }

            static void demo() {
                int[] price = {1, 5, 8, 9, 10, 17, 17, 20}; // length 1..8
                int n = 8;
                System.out.println("\nRod Cutting DP Demo:");
                System.out.println("Prices (len 1..n): " + Arrays.toString(price));
                System.out.println("Max Profit for rod length " + n + " = " + maxProfit(price, n));
                System.out.println("Time: O(n^2). Space: O(n).");
            }
        }
    }

    // ============================= PART C =============================
    static class PartC {

        static class GreedyTheory {
            static void printNotes() {
                System.out.println("Greedy Programming: choose best option at current step (local best), never backtrack.");
                System.out.println("Dynamic Programming: explores subproblems + stores results to guarantee optimal answer.");
                System.out.println("Local optimal choice: best choice now (e.g., highest value/weight in fractional knapsack).");
                System.out.println("Global optimal solution: best overall final solution.");
                System.out.println("Greedy fails example: Coin change {9,6,5,1}, amount 11 -> Greedy: 9+1+1 (3), DP: 6+5 (2).");
            }
        }
    }

    // ============================= PART D =============================
    static class PartD {

        // --------------- Activity Selection ---------------
        static class ActivitySelection {

            static class Activity {
                int start, end;
                Activity(int s, int e) { start = s; end = e; }
                public String toString() { return "(" + start + "," + end + ")"; }
            }

            static List<Activity> select(Activity[] arr) {
                Arrays.sort(arr, Comparator.comparingInt(a -> a.end));
                List<Activity> res = new ArrayList<>();
                res.add(arr[0]);
                int lastEnd = arr[0].end;

                for (int i = 1; i < arr.length; i++) {
                    if (arr[i].start >= lastEnd) {
                        res.add(arr[i]);
                        lastEnd = arr[i].end;
                    }
                }
                return res;
            }

            static void demo() {
                Activity[] a = {
                        new Activity(1,2), new Activity(3,4), new Activity(0,6),
                        new Activity(5,7), new Activity(8,9), new Activity(5,9)
                };
                System.out.println("\nActivity Selection (Greedy) Demo:");
                System.out.println("Selected: " + select(a));
                System.out.println("Time: O(n log n) due to sorting.");
            }
        }

        // --------------- Fractional Knapsack ---------------
        static class FractionalKnapsack {

            static class Item {
                int value, weight;
                Item(int v, int w) { value = v; weight = w; }
            }

            static double maxValue(Item[] items, int capacity) {
                Arrays.sort(items, (a, b) -> Double.compare(
                        (double) b.value / b.weight,
                        (double) a.value / a.weight
                ));

                double total = 0.0;
                int cap = capacity;

                for (Item it : items) {
                    if (cap == 0) break;
                    if (it.weight <= cap) {
                        cap -= it.weight;
                        total += it.value;
                    } else {
                        double frac = (double) cap / it.weight;
                        total += it.value * frac;
                        cap = 0;
                    }
                }
                return total;
            }

            static void demo() {
                Item[] items = { new Item(60,10), new Item(100,20), new Item(120,30) };
                int capacity = 50;
                System.out.println("\nFractional Knapsack (Greedy) Demo:");
                System.out.println("Max Value = " + maxValue(items, capacity));
                System.out.println("Time: O(n log n).");
            }
        }

        // --------------- Huffman Coding ---------------
        static class HuffmanCoding {

            static class Node {
                char ch;
                int freq;
                Node left, right;
                Node(char ch, int freq) { this.ch = ch; this.freq = freq; }
                Node(int freq, Node l, Node r) { this.ch = '\0'; this.freq = freq; left = l; right = r; }
                boolean isLeaf() { return left == null && right == null; }
            }

            static Node buildTree(Map<Character, Integer> freqMap) {
                PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.freq));
                for (var e : freqMap.entrySet()) pq.add(new Node(e.getKey(), e.getValue()));

                while (pq.size() > 1) {
                    Node a = pq.poll();
                    Node b = pq.poll();
                    pq.add(new Node(a.freq + b.freq, a, b));
                }
                return pq.poll();
            }

            static void buildCodes(Node root, String code, Map<Character, String> codes) {
                if (root == null) return;
                if (root.isLeaf()) {
                    codes.put(root.ch, code.length() == 0 ? "0" : code);
                    return;
                }
                buildCodes(root.left, code + "0", codes);
                buildCodes(root.right, code + "1", codes);
            }

            static void demo() {
                String s = "huffman coding example";
                Map<Character, Integer> freq = new HashMap<>();
                for (char c : s.toCharArray()) freq.put(c, freq.getOrDefault(c, 0) + 1);

                Node root = buildTree(freq);
                Map<Character, String> codes = new HashMap<>();
                buildCodes(root, "", codes);

                System.out.println("\nHuffman Coding (Greedy) Demo:");
                System.out.println("Input: " + s);
                System.out.println("Codes:");
                for (var e : codes.entrySet()) {
                    System.out.println("'" + e.getKey() + "' -> " + e.getValue());
                }
                System.out.println("Idea: higher frequency chars get shorter codes (compression).");
            }
        }

        // --------------- Prim's MST ---------------
        static class PrimsMST {

            static class Edge {
                int to, wt;
                Edge(int t, int w) { to = t; wt = w; }
            }

            static class Pair {
                int node, key;
                Pair(int n, int k) { node = n; key = k; }
            }

            static void addUndirected(List<Edge>[] g, int u, int v, int w) {
                g[u].add(new Edge(v, w));
                g[v].add(new Edge(u, w));
            }

            static void primMST(List<Edge>[] g, int V) {
                boolean[] inMST = new boolean[V];
                int[] key = new int[V];
                int[] parent = new int[V];
                Arrays.fill(key, Integer.MAX_VALUE);
                Arrays.fill(parent, -1);

                PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.key));
                key[0] = 0;
                pq.add(new Pair(0, 0));

                while (!pq.isEmpty()) {
                    Pair cur = pq.poll();
                    int u = cur.node;
                    if (inMST[u]) continue;
                    inMST[u] = true;

                    for (Edge e : g[u]) {
                        int v = e.to;
                        if (!inMST[v] && e.wt < key[v]) {
                            key[v] = e.wt;
                            parent[v] = u;
                            pq.add(new Pair(v, key[v]));
                        }
                    }
                }

                int total = 0;
                System.out.println("MST edges (parent -> node : weight)");
                for (int v = 1; v < V; v++) {
                    System.out.println(parent[v] + " -> " + v + " : " + key[v]);
                    total += key[v];
                }
                System.out.println("Total MST weight = " + total);
            }

            static void demo() {
                int V = 5;
                List<Edge>[] g = new ArrayList[V];
                for (int i = 0; i < V; i++) g[i] = new ArrayList<>();

                addUndirected(g, 0, 1, 2);
                addUndirected(g, 0, 3, 6);
                addUndirected(g, 1, 2, 3);
                addUndirected(g, 1, 3, 8);
                addUndirected(g, 1, 4, 5);
                addUndirected(g, 2, 4, 7);
                addUndirected(g, 3, 4, 9);

                System.out.println("\nPrim's MST (Greedy) Demo:");
                primMST(g, V);
                System.out.println("Time: O((V+E) log V) with priority queue.");
            }
        }

        // --------------- Job Scheduling with Deadlines ---------------
        static class JobSchedulingDeadlines {

            static class Job {
                String id;
                int deadline, profit;
                Job(String id, int d, int p) { this.id = id; deadline = d; profit = p; }
            }

            static void schedule(Job[] jobs) {
                Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

                int maxD = 0;
                for (Job j : jobs) maxD = Math.max(maxD, j.deadline);

                String[] slot = new String[maxD + 1]; // 1..maxD
                int totalProfit = 0;

                for (Job j : jobs) {
                    for (int t = j.deadline; t >= 1; t--) {
                        if (slot[t] == null) {
                            slot[t] = j.id;
                            totalProfit += j.profit;
                            break;
                        }
                    }
                }

                System.out.print("Jobs done: ");
                for (int t = 1; t <= maxD; t++) {
                    if (slot[t] != null) System.out.print(slot[t] + " ");
                }
                System.out.println("\nTotal Profit = " + totalProfit);
            }

            static void demo() {
                Job[] jobs = {
                        new Job("J1", 2, 100),
                        new Job("J2", 1, 19),
                        new Job("J3", 2, 27),
                        new Job("J4", 1, 25),
                        new Job("J5", 3, 15)
                };
                System.out.println("\nJob Scheduling with Deadlines (Greedy) Demo:");
                schedule(jobs);
                System.out.println("Time: O(n log n + n*maxDeadline).");
            }
        }
    }
}

