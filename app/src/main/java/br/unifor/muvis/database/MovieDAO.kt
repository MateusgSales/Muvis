package br.unifor.muvis.database

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import br.unifor.muvis.entity.Director
import br.unifor.muvis.entity.Movie

/**
 * Created by mateu on 01/11/2017.
 */
class MovieDAO(context: Context) : GenericDAO<Movie>(context, "movies"){

    override fun getContentValues(obj: Movie): ContentValues {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        val values = ContentValues()
        values.put("name",obj.name)
        values.put("year", obj.year)

        return values

    }

    override fun getModelByCursor(queryResult: Cursor): Movie {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        val id = queryResult.getLong(queryResult.getColumnIndex("_id"))
        val name = queryResult.getString(queryResult.getColumnIndex("name"))
        val year = queryResult.getInt(queryResult.getColumnIndex("year"))
        val Director = queryResult.getLong(queryResult.getColumnIndex("Director"))

        //return Movie()
    }
}