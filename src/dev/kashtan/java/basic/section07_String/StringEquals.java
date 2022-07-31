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

package dev.kashtan.java.basic.section07_String;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class StringEquals {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "h" + s1.substring(1);

        System.out.println(s1);
        System.out.println(s2);

        if (s1.equals(s2)) {
            System.out.println("s1 = s2");
        }
    }
}
