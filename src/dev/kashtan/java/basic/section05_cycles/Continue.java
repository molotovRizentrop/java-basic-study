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
public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i >= 3 && i <= 6) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        //Without continue
        for (int i = 0; i < 10; i++) {
            if (i < 3 || i > 6) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
