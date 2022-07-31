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

package dev.kashtan.java.basic.section03_expression;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class PrefixPostfixVersions {
    public static void main(String[] args) {
        var a = 0;
        ++a;
        a++;
        System.out.println(a);

        var b = a--;
        /*
        var b = a;
        a = a - 1;
        */
        System.out.println(b);
        System.out.println(a);

        var c = --a;
        /*
        a = a - 1;
        var c = a;
         */

        System.out.println(c);
        System.out.println(a);
    }
}
