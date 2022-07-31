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
public class ArrayCopyRange {
    public static void main(String[] args) {
        // read source data
        int[] source = {1, -2, 3, -4, 5};
        int startIndex = 1;
        int endIndex = 3;

        // processing
        int[] destination = new int[endIndex - startIndex];
        for (int i = 0; i < destination.length; i++) {
            destination[i] = source[i + startIndex];
        }
        // System.arraycopy(source, startIndex, destination, 0, destination.length);

        // display results
        System.out.println(Arrays.toString(destination));
    }
}
