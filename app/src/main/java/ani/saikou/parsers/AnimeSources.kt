package ani.saikou.parsers

import ani.saikou.Lazier
import ani.saikou.lazyList
import ani.saikou.parsers.anime.*

object AnimeSources : WatchSources() {
    override val list: List<Lazier<BaseParser>> = lazyList(
        ::NineAnime,
        ::Gogo,
        ::Zoro,
        ::Tenshi,
        ::Kamyroll,
        ::AllAnime,
        ::AnimeKisa,
        ::Monoschinos,
        ::Animefenix,
        ::Kamyroll,

    )
    override val names: List<String> = listOf(
        "9Anime",
        "Gogo",
        "Zoro",
        "Tenshi",
        "Kamyroll",
        "AllAnime",
        "9Anime Backup",
        "Monoschinos",
        "Animefenix",
        "Kamyroll"
    )
}

object HAnimeSources : WatchSources() {

    override val list: List<Lazier<BaseParser>> = lazyList(
        ::Haho,
        ::HentaiMama,
        ::HentaiStream,
        ::HentaiFF,
        ::NineAnime,
        ::Gogo,
        ::Zoro,
        ::Tenshi,
        ::Kamyroll,
        ::AllAnime,
        ::AnimeKisa,
        ::Monoschinos,
        ::Animefenix,
    )

    override val names: List<String> = listOf(
        "Haho",
        "HentaiMama",
        "HentaiStream",
        "HentaiFF",
        "9Anime",
        "Gogo",
        "Zoro",
        "Tenshi",
        "Kamyroll",
        "AllAnime",
        "9Anime Backup",
        "Monoschinos",
        "Animefenix",
    )
}
