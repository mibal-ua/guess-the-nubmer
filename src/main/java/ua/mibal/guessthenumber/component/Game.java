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

package ua.mibal.guessthenumber.component;

/**
 * @author Michael Balakhon
 * @link t.me/mibal_ua.
 */
public class Game {

    private final DataPrinter dataPrinter;

    private final UserInputReader inputReader;

    private final GameOverHandler gameOverHandler;

    private final WinnerVerifier winnerVerifier;

    public Game(final DataPrinter dataPrinter,
                final UserInputReader inputReader,
                final GameOverHandler gameOverHandler,
                final WinnerVerifier winnerVerifier) {
        this.dataPrinter = dataPrinter;
        this.inputReader = inputReader;
        this.gameOverHandler = gameOverHandler;
        this.winnerVerifier = winnerVerifier;
    }


    public void play() {
        int riddleNumber = Randomizer.getNewNumber();
        dataPrinter.printInstructions();
        while (true) {
            int userNumber = inputReader.getUserInput();
            if (winnerVerifier.isWin(riddleNumber, userNumber)) {
                dataPrinter.printInfoMessage("You have guessed the number!");
                gameOverHandler.gameOver();
                return;
            } else {
                dataPrinter.printInfoMessage(winnerVerifier.getNumberComparisonInfo());
            }
        }
    }
}
