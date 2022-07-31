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

package dev.kashtan.java.basic.section09_recursion;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class RecursionImportantRule {
    public static void main(String[] args) {
        function1(10);
        System.out.println();
    }

    private static void function1(int count) {
        if (count > 0) {
            System.out.println(count);
            function1(count - 1);
        }
        System.out.println();
    }
}
