package com.playlist.aluraflix.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType.IDENTITY
import javax.persistence.Id

@Entity(name = "video")
data class Video(
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private val id: Long,
    @Column
    private val title: String,
    @Column
    private val description: String,
    @Column
    private val url: String
)