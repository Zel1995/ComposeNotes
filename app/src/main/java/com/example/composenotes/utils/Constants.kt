package com.example.composenotes.utils

import com.example.composenotes.database.DataBaseRepository

const val TYPE_DATABASE = "type_datavase"
const val TYPE_ROOM = "type_room"
const val TYPE_FIREBASE = "type_firebase"

lateinit var REPOSITORY: DataBaseRepository

object Constants {
    object Keys {
        const val TITLE = "title"
        const val SUBTITLE = "subtitle"
        const val NOTE_DATABASE = "notes_database"
        const val NOTE_TABLE = "notes_table"
        const val ADD_NEW_NOTE = "Add new note"
        const val ADD_NOTE = "Add Note"
        const val NOTE_TITLE = "Note title"
        const val NOTE_SUBTITLE = "Note subtitle"
        const val ID = "id"
        const val NONE = "None"
        const val UPDATE = "update"
        const val UPDATE_NOTE = "update note"
        const val DELETE = "delete"
        const val NAV_BACK = "nav_back"
        const val EDIT_NOTE = "edit note"
        const val EMPTY = "empty"
    }

    object Screens {
        const val START_SCREEN = "start_screen"
        const val ADD_SCREEN = "add_screen"
        const val MAIN_SCREEN = "main_screen"
        const val NOTE_SCREEN = "note_screen"
    }
}
