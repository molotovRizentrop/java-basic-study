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
public class InvokeStack {

    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        function1(a, b);
        function2(a, b);
    }

    private static void function1(int a, int c) {
        int b = 0;
        function2(a, c);
    }

    private static void function2(int a, int b) {
        System.out.println(a / b);
    }
}
