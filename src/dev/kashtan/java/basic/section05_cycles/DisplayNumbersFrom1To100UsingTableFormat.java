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

package dev.kashtan.java.basic.section05_cycles;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class DisplayNumbersFrom1To100UsingTableFormat {
    public static void main(String[] args) {
        // read source data
        var from = 1;
        var to = 100;
        var cols = 10;

        // display results
        for (int i = from; i <= to; i++) {
            System.out.print(i + "\t");
            if (i % cols == 0) {
                System.out.println();
            }
        }
    }
}
