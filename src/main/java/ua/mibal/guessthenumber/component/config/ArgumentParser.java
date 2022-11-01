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

package ua.mibal.guessthenumber.component.config;

import ua.mibal.guessthenumber.model.UserInterface;

import static ua.mibal.guessthenumber.model.UserInterface.CONSOLE;
import static ua.mibal.guessthenumber.model.UserInterface.GUI;

/**
 * @author Michael Balakhon
 * @link t.me/mibal_ua.
 */
public class ArgumentParser {

    private UserInterface userInterface;

    private final String[] args;

    public ArgumentParser(final String[] args) {
        this.args = args;
    }

    public void parse() {
        for (final String arg : args) {
            if (CONSOLE.name().equalsIgnoreCase(arg) || GUI.name().equalsIgnoreCase(arg)) {
                if (userInterface == null) {
                    userInterface = UserInterface.valueOf(arg.toUpperCase());
                } else {
                    System.err.printf(
                            "Invalid command line argument: '%s', because user interface already set: '%s'.%n",
                            arg, userInterface
                    );
                }
            } else {
                System.err.printf("Unsupported command line argument: '%s'.%n", arg);
            }
        }
        if (userInterface == null) {
            userInterface = GUI;
        }
    }

    public UserInterface getUI() {
        return userInterface;
    }
}
