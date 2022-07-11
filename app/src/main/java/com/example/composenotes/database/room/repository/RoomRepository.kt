package com.example.composenotes.database.room.repository

import androidx.lifecycle.LiveData
import com.example.composenotes.database.DataBaseRepository
import com.example.composenotes.database.room.dao.NoteRoomDao
import com.example.composenotes.model.Note

class RoomRepository(private val noteRoomDao: NoteRoomDao) : DataBaseRepository {
    override val readAll: LiveData<List<Note>>
        get() = noteRoomDao.getAllNotes()

    override suspend fun create(note: Note, onSuccess: () -> Unit) {
        noteRoomDao.addNote(note)
        onSuccess()
    }

    override suspend fun update(note: Note, onSuccess: () -> Unit) {
        noteRoomDao.updateNote(note)
        onSuccess()
    }

    override suspend fun delete(note: Note, onSuccess: () -> Unit) {
        noteRoomDao.deleteNote(note)
        onSuccess()
    }
}
