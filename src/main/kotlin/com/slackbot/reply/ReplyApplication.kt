package com.slackbot.reply

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableBatchProcessing
@SpringBootApplication
class ReplyApplication

fun main(args: Array<String>) {
	runApplication<ReplyApplication>(*args)
}
