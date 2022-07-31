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

package dev.kashtan.java.basic.section06_array;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class LinearSearch {
    public static void main(String[] args) {
        // read source data
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        var query = 60;

        // processing
        var index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == query) {
                index = i;
                break;
            }
        }

        // display results
        System.out.println(index);
    }
}
