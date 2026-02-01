package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskSchedulerQueue {

    static class Task {
        String name;
        int durationMs;

        Task(String name, int durationMs) {
            this.name = name;
            this.durationMs = durationMs;
        }
    }

    public static void addTask(Queue<Task> q, String name, int durationMs) {
        q.offer(new Task(name, durationMs));
    }

    public static void runScheduler(Queue<Task> q) {
        while (!q.isEmpty()) {
            Task t = q.poll();
            System.out.println("Running: " + t.name + " (" + t.durationMs + "ms)");
            // Just simulation (no sleep to keep it simple)
            System.out.println("Completed: " + t.name);
        }
    }

    public static void main(String[] args) {
        Queue<Task> q = new ArrayDeque<>();
        addTask(q, "Open IDE", 200);
        addTask(q, "Build Project", 500);
        addTask(q, "Run Tests", 300);

        runScheduler(q);
    }
}

