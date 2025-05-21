# Kochi Instana Hackathon 2025

Welcome to the Kochi Instana Hackathon 2025! This repository contains the code to start of with, and all the resources you need to finish the Hackathon.

## What is this about?

As you probably already heard, today we will be using Kafka. Your job is to read messages from Kafka and process them. You will see how you should process them in the tasks below.

The goal of this Hackathon is that you familiarise yourself with Kafka and its concepts, and learn how to interact with it.

This hackathon is, by the way, a race against each other. You have been split into three teams, red, green and blue. The team that finishes first wins the Hackathon and a prize! So make sure to work together and finish the tasks as efficiently as possible.

## Things you need to know

Before you start, you need to know a few things:

- Clone this repository to your local machine. You will use it to build your solutions.
- Make sure you know which team you are playing for.
- In `.env`, make sure you are setting your team color as `TEAM_COLOR`. You will also find other environment variables there. You will need them to solve the tasks.
- You will work in Java. You can find a project to start with in `src`.
- Please do not make use of ChatGPT or any other AI tool to solve the tasks. We want you to learn and understand the concepts, not just copy-paste code.
- You are of course free to use the internet to look up documentation and similar, but again, please do not just copy-paste code. Make sure you understand what you are doing.

With that said, let's get started!

## Task 1

In this task, you will be reading messages from Kafka, process them, and send the processed messages to a REST server.

These are the requirements:

- Work in the `Task1` class. You can create new classes as needed.
- Take a look at the big screen. For every team, you will see the name of a Kafka topic to read from. You need to read messages from that topic.
- You can find the Kafka URL and a username and password in the `.env` file.
- The messages that you will receive from Kafka are encoded in Base64.
- You will have to decode the received messages
- The decoded messages are JSON objects. They have a `value` field.
- The URL of the REST server you send to is in the `.env` file. The endpoint is `/task1`.
- The REST server is secured with basic authentication. The username and password are also in the `.env` file.
- The endpoint expects a JSON containing `value`, `team`, and `stage`. The `value` is the decoded value of the message, `team` is your team color, and `stage` is 1.

If you did everything correctly, you should see the hourglass icon on the big screen turn into a checkmark. If it does, you will see names of new Kafka topics. You will need these topics in the next task. If the message you sent to us is not correct, you will get an error message as resonse. Make sure to read it.

## Task 2

Given the new topics, you will now need to read messages from one topic (`read`) and send them to another topic (`write`). This time, the processing is a bit more complex. You will need to do the following:

- Work in the `Task2` class. You can create new classes as needed, but the main work should be done in Task2.java.
- Read messages from the `read` topic revealed on the big screen.
- The messages coming in are JSON objects. They have a `value` and a `timestamp` field.
- There are messages coming in every few seconds. Your job is to send one message every minute to your `write` topic.
- The message you send to the `write` topic should be a JSON object containing `value` and `timestamp`. The `value` is the sum of all `value` fields of messages within the same minute. The `timestamp` is the timestamp of the last message in that minute. Use it to group by the minute.

Build up a pipeline that reads messages, processes them, and sends them to the `write` topic. Think outside the box: What could you use to achieve this?

If you did everything correctly, you should see the second hourglass icon on the big screen turn into a checkmark, and with that, you are done with the Hackathon! Congratulations!
