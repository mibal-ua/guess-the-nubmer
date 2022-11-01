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

package ua.mibal.guessthenumber;

import ua.mibal.guessthenumber.component.ArgumentParser;
import ua.mibal.guessthenumber.component.DataPrinter;
import ua.mibal.guessthenumber.component.Game;
import ua.mibal.guessthenumber.component.UserInputReader;
import ua.mibal.guessthenumber.component.console.ConsoleDataPrinter;
import ua.mibal.guessthenumber.component.console.ConsoleInputReader;
import ua.mibal.guessthenumber.component.swing.GameWindow;
import ua.mibal.guessthenumber.model.UserInterface;

import static java.lang.String.format;
import static ua.mibal.guessthenumber.model.UserInterface.CONSOLE;
import static ua.mibal.guessthenumber.model.UserInterface.GUI;

/**
 * @author Michael Balakhon
 * @link t.me/mibal_ua.
 */
public class GameFactory {

    private final UserInterface userInterface;

    public GameFactory(final String[] args) {
        final ArgumentParser argumentParser = new ArgumentParser(args);
        userInterface = argumentParser.getUI();
    }

    public Game create() {
        DataPrinter dataPrinter;
        UserInputReader inputReader;
        if(userInterface == GUI) {
            final GameWindow gameWindow = new GameWindow();
            dataPrinter = gameWindow;
            inputReader = gameWindow;
        } else if(userInterface == CONSOLE){
            dataPrinter = new ConsoleDataPrinter();
            inputReader = new ConsoleInputReader(dataPrinter);
        } else {
            throw new IllegalArgumentException(format(
                    "User interface `%s` is undetected", userInterface.name()
            ));
        }
        return new Game(dataPrinter, inputReader);
    }
}
