class Solution {
    public int bulbSwitch(int n) {
        // brute force approach (Time Limit Exceeds)
//        boolean []arr=new boolean[n];


// // First pass
//         for (int i = 0; i < n; i++)
//         {
//             arr[i] = true;
//         }

// // Toggle properly
//         for (int i = 2; i <= n; i++)
//         {
//             for (int j = i; j <= n; j += i)
//             {
//                 arr[j - 1] = !arr[j - 1];
//             }
//         }

//         int count = 0;

//         for (int i = 0; i < n; i++)
//         {
//             if (arr[i])
//             {
//                 count++;
//             }
//         }

//        return count;
    // Optimal Approach(Matametical Solution)
    return (int ) Math.sqrt(n);

    }
}