package com.example.domain.entity

import org.babyfish.jimmer.sql.*

@Entity
interface Author : BaseEntity {

    @Key
    val firstName: String

    @Key
    val lastName: String

    /*
     * 这里，Gender是一个枚举，，代码稍后给出
     */
    val gender: Gender
}
