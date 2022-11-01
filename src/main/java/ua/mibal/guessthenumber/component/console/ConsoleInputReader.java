/*
 * Copyright (c) 2022. http://t.me/mibal_ua
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

package ua.mibal.guessthenumber.component.console;

import ua.mibal.guessthenumber.component.DataPrinter;
import ua.mibal.guessthenumber.component.UserInputReader;

/**
 * @author Michael Balakhon
 * @link t.me/mibal_ua.
 */
public class ConsoleInputReader implements UserInputReader {

    public ConsoleInputReader(final DataPrinter dataPrinter) {
    }

    @Override
    public int getUserInput() {
        return 0;
    }
}
