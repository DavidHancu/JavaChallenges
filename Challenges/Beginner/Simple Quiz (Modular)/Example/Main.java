package com.davidhancu.beginnerchallengeone;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public final class Main {

    static ArrayList<String> questions = new ArrayList<>();
    static ArrayList<String> answers = new ArrayList<>();

    public static void main(String[] args) {
        loadQuestions();
    }

    static void end()
    {
        System.out.println("The quiz has stopped.");
        System.exit(0);
    }

    static void loadQuestions() {
        try {
            File file = new File("./questions.txt");

            if (!file.exists()) {
                System.out.println("Ouch! The questions file doesn't exist. I'm creating it now and stopping the quiz!");
                file.createNewFile();

                end();
                return;
            }

            StringBuilder question = new StringBuilder();

            int i = 0;

            for(String line : Files.readAllLines(Paths.get(file.toURI())))
            {
                if(line.startsWith("<question>") && !line.endsWith("</question>")) {
                    line = line.replace("<question>", "");
                    question = new StringBuilder(line).append("\n");
                    continue;
                }

                if(line.startsWith("<question>") && line.endsWith("</question>"))
                {
                    question = new StringBuilder();
                    questions.add(line.replace("<question>", "").replace("</question>", ""));
                    i++;
                    continue;
                }

                if(!line.startsWith("<question>") && !line.endsWith("</question>"))
                {
                    question.append(line).append("\n");
                    continue;
                }

                if(!line.startsWith("<question>") && line.endsWith("</question>"))
                {
                    question.append(line.replace("</question>",""));
                    questions.add(question.toString());
                    question = new StringBuilder();
                    i++;
                    continue;
                }

            }

            if(i == 0)
            {
                System.out.println("This quiz doesn't have any questions!");
                end();
            }

            startAsking();

        } catch (IOException e) {
            System.out.println("Ouch! An error occurred while loading the questions.");
            end();
        }
    }

    static void startAsking()
    {
        int currentQuestion = 1;
        System.out.println("Question: " + questions.get(0) + " (" + currentQuestion + "/" + questions.size() + ")");
        System.out.print("Answer: ");
        currentQuestion++;

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine())
        {
            String answer = scanner.nextLine();

            if(answer.equalsIgnoreCase("\"stop\"")) {
                end();
                break;
            }

            answers.add(answer);
            if(currentQuestion > questions.size())
            {
                System.out.println("Congrats! You reached the end of this quiz.");
                System.out.println("Your answers were: ");
                for(String s : answers)
                    System.out.println(" - " + s);
                break;
            }

            System.out.print("\n");
            System.out.println("Question: " + questions.get(currentQuestion - 1) + " (" + currentQuestion + "/" + questions.size() + ")");
            System.out.print("Answer: ");
            currentQuestion++;
        }
    }
}
