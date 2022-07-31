/*
 * Copyright (c) 2021. http://dev.kashtan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.kashtan.java.basic.section08_functions;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class CheckIfAllNumbersArePositiveUsingFunction {
    public static void main(String[] args) {
        // read source data
        int[] array = {1, 2, 3, 4, 5};

        // processing
        boolean allPositive = isAllPositive(array);

        // display results
        System.out.println(allPositive ? "All positive" : "Not all positive");
    }

    private static boolean isAllPositive(int[] array) {
        var allPositive = true;
        for (int value : array) {
            if (value < 0) {
                allPositive = false;
                break;
            }
        }
        return allPositive;
    }
}
