package br.unifor.muvis.database

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import br.unifor.muvis.entity.Actor

/**
 * Created by mateu on 01/11/2017.
 */
class ActorDAO(context: Context) : GenericDAO<Actor>(context, "Actors") {

    override fun getContentValues(obj: Actor): ContentValues {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        val values = ContentValues()
        values.put("name",obj.name)

        return values
    }

    override fun getModelByCursor(queryResult: Cursor): Actor {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        val id = queryResult.getLong(queryResult.getColumnIndex("_id"))
        val name = queryResult.getString(queryResult.getColumnIndex("name"))

        //return Actor()
    }
}
