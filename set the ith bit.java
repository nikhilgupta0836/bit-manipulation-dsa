// // To set the ith bit
// int setBit(int n, int i) {
//     return n | (1 << i);
// }
// //

 // new comment 
//  clear the bit //
// public class BitManipulation {

//     // Clear the ith bit
//     static int clearBit(int n, int i) {
//         return n & ~(1 << i);
//     }

//     public static void main(String[] args) {
//         int n = 13; // binary: 1101
//         int i = 2;  // we want to clear the 2nd bit (0-based from right)
        
//         int result = clearBit(n, i);
//         System.out.println("Result after clearing " + i + "th bit: " + result);
//         // Output: 5 (binary: 0101)
//     }
// }
      

/// toggle the ith bit //

// // To toggle the ith bit
// int toggleBit(int n, int i) {
//     return n ^ (1 << i);
// }
  

//// check if the ith bit is set or not 


//   bool isBitSet(int n, int i) {
//       return (n & (1 << i)) != 0;
//   }
   



/// unset the ith bit //
/// 
//   int unsetBit(int n, int i) {
//       return n & ~(1 << i);
//   }
