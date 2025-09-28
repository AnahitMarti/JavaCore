package homework;

public class Homework4 {
    public static void main(String[] args) {
        //Example 1

        int[] nums = {12, 5, 6, 85, 92, 4, 74, 23, 6, 88};
        int n = 6;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == n) {
                count++;


            }
        }
        System.out.println(count);
        System.out.println();
        System.out.println();


        //Example 2
        int[] numbers = {75, 69, 12, 44, 18, 2, 65, 39, 84, 29};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");

        }
        System.out.println("\n\n");


        //Example 3
        int[] numbers2 = {74, 44, 10, 11, 21, 11, 44, 2, 7, 2};
        int count2 = 0;
        for (int i = 0; i < numbers2.length; i++) {
            for (int j = i + 1; j < numbers2.length; j++) {
                if (numbers2[i] == numbers2[j]) {
                    count2++;
                    break;
                }

            }

        }
        System.out.println(count2);
        System.out.println("\n");


//example 4
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ' };
        char[] vowel = {'ա', 'ե', 'է', 'ը', 'ի', 'ո', 'օ', 'ո', 'ւ' };
        int count3 = 0;

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < vowel.length; j++) {
                if (chars[i] == vowel[j]) {
                    count3++;
                    break;
                }
                {


                }

            }


        }
        System.out.println(count3);
    }
}


