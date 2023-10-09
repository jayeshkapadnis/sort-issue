package com.sort

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldNotBe
import io.micronaut.data.model.Sort
import io.micronaut.test.extensions.kotest5.annotation.MicronautTest

@MicronautTest
class SortIssueTest(private val repository: UsersRepository) : StringSpec({

    "should get the users" {
        val users = repository.findAll(Sort.of(Sort.Order.desc("audit.createdAt", false)))

        users shouldNotBe emptyList<User>()
    }
})
