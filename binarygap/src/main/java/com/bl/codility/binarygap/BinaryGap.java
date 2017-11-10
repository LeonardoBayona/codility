package com.bl.codility.binarygap;

public class BinaryGap {

    // Results:
    // https://codility.com/demo/results/trainingC6HSFK-KSS/
    public int calculateBinaryGap(int number) {
        int maxBinaryGap = 0;
        int lastOnePosition = -1;
        int currentPosition = 0;
        while(number > 0) {
            int currentDigit = number % 2;

            if(lastOnePosition >= 0 && currentDigit == 1) {
                // new binary gap found
                int currentBinaryGap = currentPosition - lastOnePosition - 1;
                maxBinaryGap = (maxBinaryGap < currentBinaryGap)
                        ? currentBinaryGap
                        : maxBinaryGap;
            }

            // values for next iteration
            lastOnePosition = (currentDigit == 1)
                    ? currentPosition
                    : lastOnePosition;
            number = number / 2;
            currentPosition++;
        }

        return maxBinaryGap;
    }

    public int calculateBinaryGap2(int number) {
        int maxBinaryGap = 0;
        int currentBinaryGap = 0;
        boolean intoBinaryGap = false;
        while(number > 0) {
            int currentDigit = number%2;

            if(!intoBinaryGap) {
                if(currentDigit == 1) {
                    intoBinaryGap = true;
                    currentBinaryGap = 0;
                }
            }
            else {
                if(currentDigit == 0) {
                    currentBinaryGap++;
                }
                else {
                    intoBinaryGap = true;
                    maxBinaryGap = (maxBinaryGap < currentBinaryGap)
                            ? currentBinaryGap
                            : maxBinaryGap;
                    currentBinaryGap = 0;
                }
            }

            number = number / 2;
        }

        return maxBinaryGap;
    }

}
