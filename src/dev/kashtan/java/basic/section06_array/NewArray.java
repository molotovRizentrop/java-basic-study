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
public class NewArray {
    public static void main(String[] args) {
        int[] arrayWithValues1 = {1, 2, 3, 4, 5};
        double[] arrayWithValues2 = {1., 2., 3., 4., 5.};
        boolean[] arrayWithValues3 = {true, false, true, false, true};
        char[] arrayWithValues4 = {'1', '2', '3', '4', '5'};
        String[] arrayWithValues5 = {"1", "2", "3", "4", "5"};

        int[] arrayWithSize1 = new int[5]; // 0
        double[] arrayWithSize2 = new double[5]; // 0.0
        boolean[] arrayWithSize3 = new boolean[5]; // false
        char[] arrayWithSize4 = new char[5]; // \u0000
        String[] arrayWithSize5 = new String[5]; // null

        int[] emptyArray1 = {};
        int[] emptyArray2 = new int[0];

        int[] invalidArrayExample;
    }
}
