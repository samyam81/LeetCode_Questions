import java.util.HashSet;
import java.util.Set;

public class CommonElements {
        public int[] findIntersectionValues(int[] nums1, int[] nums2) {
            int[] res = new int[2];
            HashSet<Integer> Ss40 = new HashSet<>();
            HashSet<Integer> Ss458 = new HashSet<>();

            for (int Samyam : nums1) {
                Ss40.add(Samyam);
            }

            for (int Samyam : nums2) {
                Ss458.add(Samyam);
            }

            for (int Samyam : nums1) {
                res[0] += Ss458.contains(Samyam) ? 1 : 0;
            }

            for (int Samyam : nums2) {
                res[1] += Ss40.contains(Samyam) ? 1 : 0;
            }
            return res;
        }
}

