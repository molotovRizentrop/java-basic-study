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

package dev.kashtan.java.basic.section04_conditional;

import java.util.Scanner;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class UniversalWeekDay {
    public static void main(String[] args) {
        // read source data
        int day = new Scanner(System.in).nextInt();
        var isMondayFirst = false;

        // processing
        var internalDay = day;
        if (!isMondayFirst) {
            internalDay--;
            if (internalDay == 0) {
                internalDay = 7;
            }
        }
        String result;
        if (internalDay == 1) {
            result = "Monday";
        } else if (internalDay == 2) {
            result = "Tuesday";
        } else if (internalDay == 3) {
            result = "Wednesday";
        } else if (internalDay == 4) {
            result = "Thursday";
        } else if (internalDay == 5) {
            result = "Friday";
        } else if (internalDay == 6) {
            result = "Saturday";
        } else if (internalDay == 7) {
            result = "Sunday";
        } else {
            result = "Invalid day: " + day;
        }

        // display results
        System.out.println(result);
    }
}
