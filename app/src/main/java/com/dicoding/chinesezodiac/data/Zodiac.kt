package com.dicoding.chinesezodiac.data

data class Zodiac (
        var name: String = "",
        var personality: String = "",
        var desc: String = "",
        var img: String = "",
        var mini_img: Int = 0,
        var str: List<String> = emptyList(),
        var weak: List<String> = emptyList(),
        var relation: List<String> = emptyList()
)