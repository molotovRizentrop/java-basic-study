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
public class SumFunctionWithVarArgs {

    public static void main(String[] args) {
        System.out.println(sumOf());
        System.out.println(sumOf(1, 2));
        System.out.println(sumOf(1, 2, 3, 4, 5));
    }

    private static int sumOf(int... args) {
        var sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }
}
