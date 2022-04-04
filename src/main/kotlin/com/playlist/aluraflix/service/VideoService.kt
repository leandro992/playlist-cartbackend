package com.playlist.aluraflix.service

import com.playlist.aluraflix.domain.Video

interface VideoService {

    fun save(): Video
    fun replace(video: Video): Video
    fun delete(id: Long)
    fun allVideo(): List<Video>
    fun getById(id: Long): Video
}