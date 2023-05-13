package com.example.github2.ui.fragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.github2.model.FilmModel

@Suppress("UNREACHABLE_CODE", "CAST_NEVER_SUCCEEDS")
class FilmViewModel: ViewModel() {

    private var list: MutableLiveData<ArrayList<FilmModel>> = MutableLiveData()

    fun getListPictures(): MutableLiveData<ArrayList<FilmModel>> {

        val picturesModelList: ArrayList<FilmModel> = ArrayList()

        picturesModelList.add(
            FilmModel(
                "https://m.media-amazon.com/images/I/81oND6XuHsL._AC_SY550_.jpg",
                "Harry potter"
            )
        )
        picturesModelList.add(
            FilmModel(
                "https://static.kinoafisha.info/k/movie_posters/220/upload/movie_posters/4/9/2/8356294/1d005924fddff94a8871d2102df5662c.jpg",
                "главный герой"
            )
        )
        picturesModelList.add(
            FilmModel(
                "https://m.media-amazon.com/images/M/MV5BMmIwYzFhODAtY2I1YS00ZDdmLTkyYWQtZjI5NDIwMDc2MjEyXkEyXkFqcGdeQXVyODk4OTc3MTY@._V1_.jpg",
                "lost city"
            )
        )
        picturesModelList.add(
            FilmModel(
                "https://avatars.mds.yandex.net/get-kinopoisk-image/6201401/2e51cb8b-fd51-4166-84a2-63559733baac/300x450",
                "avatar"
            )
        )
        picturesModelList.add(
            FilmModel(
                "https://m.media-amazon.com/images/M/MV5BMjMyNDkzMzI1OF5BMl5BanBnXkFtZTgwODcxODg5MjI@._V1_FMjpg_UX1000_.jpg",
                "thor ragnarok"
            )
        )
        picturesModelList.add(
            FilmModel(
                "https://m.media-amazon.com/images/M/MV5BMTU2NjA1ODgzMF5BMl5BanBnXkFtZTgwMTM2MTI4MjE@._V1_.jpg",
                "john wick"
            )
        )
        picturesModelList.add(
            FilmModel(
                "https://m.media-amazon.com/images/M/MV5BZmYzMzU4NjctNDI0Mi00MGExLWI3ZDQtYzQzYThmYzc2ZmNjXkEyXkFqcGdeQXVyMTEyMjM2NDc2._V1_.jpg",
                "godzilla vc kong"
            )
        )
        picturesModelList.add(
            FilmModel(
                "https://m.media-amazon.com/images/M/MV5BZWMyYzFjYTYtNTRjYi00OGExLWE2YzgtOGRmYjAxZTU3NzBiXkEyXkFqcGdeQXVyMzQ0MzA0NTM@._V1_.jpg",
                "spider man"
            )
        )
        picturesModelList.add(
            FilmModel(
                "https://m.media-amazon.com/images/M/MV5BYzZkOGUwMzMtMTgyNS00YjFlLTg5NzYtZTE3Y2E5YTA5NWIyXkEyXkFqcGdeQXVyMjkwOTAyMDU@._V1_.jpg",
                "black adam"
            )
        )
        picturesModelList.add(
            FilmModel(
                "https://st.peopletalk.ru/wp-content/uploads/2023/01/orig-2-640x1013.jpeg",
                "megan"
            )
        )
        picturesModelList.add(
            FilmModel(
                "https://toutelaculture.com/wp-content/uploads/2023/01/affiche-Babylone-680x924.webp",
                "babylon"
            )
        )
        picturesModelList.add(
            FilmModel(
                "https://m.media-amazon.com/images/M/MV5BOTk5ODg0OTU5M15BMl5BanBnXkFtZTgwMDQ3MDY3NjM@._V1_FMjpg_UX1000_.jpg",
                "aquaman"
            )
        )

        list.value = picturesModelList
        return list
    }
}