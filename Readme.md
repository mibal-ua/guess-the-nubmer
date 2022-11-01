# The Guess the number Project

-----------------------------------------------------------------------------------

## Without JRE

### Build instructions

- Build distributions using maven tool:

```bash
mvn -P without-jre clean package
```

- Use the following archives:
  - `target/guess-the-number-${project.version}-windows.zip` for Windows
  - `target/guess-the-number-${project.version}-unix.tar.gz` for MacOS or Linux

### Run instructions

- Download [OpenJDK 11](https://jdk.java.net/11/);
- Unzip the downloaded OpenJDK archive;
- Configure the `PATH` environment variable:
  - Add `%JDK_HOME%\bin\` directory for Windows;
  - Add `$JDK_HOME/bin/` directory for MacOS and Linux;
- Re-login or restart computer;
- Unzip the Guess the number distribution:
  - Unzip `guess-the-number-${project.version}-windows.zip` for Windows;
  - Unzip `guess-the-number-${project.version}-unix.tar.gz` for MacOS or Linux;
- Go to unzipped directory;
- Run the game by double-click on the start script:
  - `start.cmd` for Windows;
  - `start.sh` for MacOS or Linux;

-----------------------------------------------------------------------------------

## With JRE

### Build instructions

- Build distributions using maven tool:

```bash
mvn -P with-jre clean package
```

- Use the following archives:
  - `target/guess-the-number-${project.version}-windows-with-jre.zip` for Windows
  - `target/guess-the-number-${project.version}-macos-with-jre.tar.gz` for MacOS
  - `target/guess-the-number-${project.version}-linux-with-jre.tar.gz` for Linux

### Run instructions

- Unzip the Tic tac toe distribution:
  - Unzip `guess-the-number-${project.version}-windows-with-jre.zip` for Windows;
  - Unzip `guess-the-number-${project.version}-macos-with-jre.tar.gz` for MacOS;
  - Unzip `guess-the-number-${project.version}-linux-with-jre.tar.gz` for Linux;
- Go to unzipped directory;
- Run the game by double-click on the start script:
  - `start.cmd` for Windows;
  - `start.sh` for MacOS or Linux;

-----------------------------------------------------------------------------------

### Important run info:

#### You can use `start.sh`(or `.cmd`) script with arguments (you can see list below):

1. Open the terminal in folder with scripts.
2. Enter command `./start.sh ${your-arguments}`.
3. List of arguments:
  - User Interface: `GUI`, `CONSOLE`;

#### Example of use:

```bash
./start.sh GUI
```

- User interface became `GUI`;

> On Windows you must enter command without `./` in start

-----------------------------------------------------------------------------------

## Readme tutorial

- https://guides.github.com/features/mastering-markdown/
- https://help.github.com/categories/writing-on-github/
