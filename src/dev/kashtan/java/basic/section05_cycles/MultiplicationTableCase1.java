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
public class MultiplicationTableCase1 {
    public static void main(String[] args) {
        // read source data
        var to = 9;

        //display results
        for (int i = 1; i <= to; i++) {
            for (int j = 1; j <= to; j++) {
                var res = i * j;
                System.out.print((res == 1 ? "" : res) + "\t");
            }
            System.out.println();
        }
    }
}
