import java.util.*;

class MinimumCost {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        double[][] ratios = new double[n][2]; // ratio, quality
        for (int i = 0; i < n; i++) {
            ratios[i][0] = (double) wage[i] / quality[i];
            ratios[i][1] = quality[i];
        }

        Arrays.sort(ratios, Comparator.comparingDouble(a -> a[0]));

        PriorityQueue<Double> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        double minCost = Double.MAX_VALUE;
        double qualitySum = 0;

        for (double[] ratio : ratios) {
            qualitySum += ratio[1];
            maxHeap.offer(ratio[1]);
            
            if (maxHeap.size() > k) {
                qualitySum -= maxHeap.poll();
            }

            if (maxHeap.size() == k) {
                minCost = Math.min(minCost, qualitySum * ratio[0]);
            }
        }

        return minCost;
    }
}
