package br.unifor.muvis.database

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import br.unifor.muvis.entity.Movie

/**
 * Created by mateu on 01/11/2017.
 */
class MovieDAO(context: Context) : GenericDAO<Movie>(context, "movies"){

    override fun getContentValues(obj: Movie): ContentValues {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getModelByCursor(queryResult: Cursor): Movie {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}