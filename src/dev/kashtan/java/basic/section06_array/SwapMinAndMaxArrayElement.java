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

import java.util.Arrays;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class SwapMinAndMaxArrayElement {
    public static void main(String[] args) {
        // read source data
        int[] array = {1, -2, 3, 8, 5};

        // processing
        var indexOfMinElement = 0;
        var minValue = array[0];
        var indexOfMaxElement = 0;
        var maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            var current = array[i];
            if (current < minValue) {
                minValue = current;
                indexOfMinElement = i;
            }
            if (current > maxValue) {
                maxValue = current;
                indexOfMaxElement = i;
            }
        }
        var temp = array[indexOfMaxElement];
        array[indexOfMaxElement] = array[indexOfMinElement];
        array[indexOfMinElement] = temp;

        // display results
        System.out.println(Arrays.toString(array));
    }
}