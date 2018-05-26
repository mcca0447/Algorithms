public static void sort(int[] input) {

        int inputLength = input.length;

        for (int i = 0; i < inputLength - 1; i++) {

            int min = i;

            // find the first, second, third, fourth... smallest value
            for (int j = i + 1; j < inputLength; j++) {
                if (input[j] < input[min]) {
                    min = j;
                }
            }

            // swaps the smallest value with the position 'i'
            int temp = input[i];
            input[i] = input[min];
            input[min] = temp;

            //next pls
        }

    }
