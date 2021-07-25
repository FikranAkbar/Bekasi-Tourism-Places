package com.fikranakbar.bekasitourismplaces

object TourismPlacesData {
    private val names = arrayOf(
        "Curug Parigi",
        "Danau Cibeureum",
        "Taman Buaya Indonesia Jaya",
        "Rumah Pohon Jatiasih",
        "Bumi Perkemahan Karang Kirti",
        "Snow World International",
        "Gedung Juang ’45",
        "Saung Ranggon",
        "Venetian Water Carnaval",
        "Pantai Mekar"
    )

    private val descriptions = arrayOf(
        "Sering disebut-sebut sebagai Niagara Mini, Curug Parigi adalah destinasi wisata alam Bekasi yang cukup layak untuk dikunjungi. Namun, untuk mencapai air terjun yang cukup lebar ini, Toppers perlu sedikit melakukan tracking di jalur alam dengan pemandangan asri namun cukup menantang.",
        "Pilihan wisata alam Bekasi lainnya adalah Danau Cibeureum yang memiliki luas sekitar 2 hektar dengan pulau kecil yang berada di tengah. Di tepian danau, Toppers juga bisa menemukan warung-warung yang menjajakan kuliner lokal. Destinasi wisata kota Bekasi ini juga merupakan spot hunting foto favorit fotografer untuk mengarahkan lensa kamera dan menangkap foto terbaik.",
        "Tempat wisata Bekasi yang juga dikenal dengan nama Taman Buaya Bekasi ini disebut-sebut sebagai penangkaran Buaya terbesar di Asia dengan spesies terlengkap. Ratusan ekor buaya dari berbagai spesies bisa Toppers temui di objek wisata kota Bekasi ini. Beragam aktivitas seperti pemberian makan buaya hingga proses penetasan telur buaya bisa juga disaksikan di tempat ini pada jam-jam tertentu.",
        "Destinasi wisata Bekasi selanjutnya adalah tujuan wisata yang cocok untuk mengenalkan anak-anak terhadap alam. Objek wisata keluarga sekaligus wisata alam di Bekasi ini menyajikan pemandangan alam yang asri. Di tempat wisata Bekasi satu ini, Toppers bisa berjalan santai dibawah rindangnya pepohonan, menikmati panorama danau sekaligus memancing. Berbagai rumah pohon juga tersedia di komplek wisata Bekasi ini untuk bersantai bersama keluarga. Aktivitas lain yang bisa Toppers lakukan di tempat wisata Bekasi ini antara lain outbond hingga mengendarai motor ATV.",
        "Bumi perkemahan Karang Kirti adalah pilihan tempat wisata di kota Bekasi selanjutnya dimana Toppers tak hanya bisa lebih dekat dengan alam dengan berkemah, tapi juga melakukan berbagai aktivitas outbond seru. Jika Toppers tak pernah berkemah sebelumnya, tak perlu khawatir, berbagai perlengkapan kemah mulai dari tenda hingga sleeping bag bisa disewa dan juga terdapat instruktur yang akan membantumu.",
        "Dikenal juga dengan nama Dunia Salju Bekasi, objek wisata kota Bekasi satu ini tergolong unik karena Toppers bisa merasakan dinginnya salju ditengah teriknya kota Bekasi. Disini, kamu bisa melihat pameran berbagai bentuk ukiran yang terbuat dari balok es yang didekorasi cantik dengan lampu. Selain merasakan turunnya salju bak tengah berasa di musim dingin, Toppers juga bisa merasakan serunya meluncur diatas es, lho.",
        "Alternatif liburan di Bekasi selanjutnya adalah objek wisata kota Bekasi yang bersejarah Gedung juang ’45. Gedung yang juga dikenal dengan nama Gedung Tinggi ini adalah salah satu monumen bersejarah saksi biksu perjuangan masyarakat Bekasi pada masa kolonialisasi Belanda. Dengan arsitektur yang khas, Toppers bisa jadikan tempat wisata Bekasi satu ini sebagai salah satu spot hunting foto yang menarik di Bekasi.",
        "Berbicara soal wisata sejarah di Bekasi, Saung Ranggon wajib masuk dalam daftar wisata sejarah Bekasi-mu. Dibangun oleh Pangeran Rangga (putra dari Pangeran Jayakarta) pada abad ke-16, Saung ini dibuat sebagai tempat persembunyian dari Belanda. Ditemukan kembali pada 1821 oleh Pangeran Abbas, saung berukuran 7,6 x 7,2 meter ini berdiri 2,5 meter dari ketinggian permukaan tanah. Meski telah direnovasi beberapa kali, Toppers masih bisa menemukan berbagai ornamen asli dari bangunan bersejarah ini.",
        "Ingin merasakan suasana kota Venesia yang tersohor? Di Bekasi, Toppers bisa mengintip suasana menyerupai Venesia di Venetian Water Carnaval, waterboom dengan konsep Venesia yang menarik. Selain konsep yang menarik, tempat bermain air ini juga memiliki harga tiket yang cukup terjangkau, lho!",
        "Siapa sangka ternyata di Bekasi terdapat wisata pantai yang cukup menarik untuk disinggahi. Salah satunya adalah wisata pantai Mekar di daerah Muara Gembong. Tak hanya bisa bersantai di tepian pantai dengan gazevo-gazebo sederhana, Toppers juga bisa menjelajah perairan sekitar dengan menyewa perahu nelayan setempat.",
    )

    private val locations = arrayOf(
        "Cikiwul, Bantargebang",
        "Desa Lambang Sari & Desa Lambang Jaya, Tambun, Bekasi",
        "Jl. Raya Serang – Cibarusah KM.3, Sukaragam, Serang Baru, Bekasi",
        "Jl Raya Parpostel, Jatiasih, Bekasi",
        "Jl. Desa Karang Mulya, Bojongmangu, Bekasi",
        "Jalan Jend. Ahmad Yani Kav. 1, Pekayon Jaya, Bekasi Selatan",
        "Jl. Sultan Hasanudin No.39, Setiadarma, Tambun Selatan, Bekasi",
        "Kampung Cikedokan, Desa Cikedokan, Kecamatan Cikarang Barat, Bekasi",
        "Perumahan Villa Mutiara Gading 2, Jalan Agus Salim, Karangsatria, Tambun Utara, Karangsatria",
        "Desa Pantai Mekar, Muara Gembong, Bekasi"
    )

    private val operationHours = arrayOf(
        "24 jam",
        "24 jam",
        "8.00 – 16.00 WIB",
        "9.00 – 17.00 WIB",
        "Senin – Jumat (10.30 – 18.30 WIB), Sabtu – Minggu (09.00 – 20.00 WIB)",
        "24 jam",
        "13.00 – 20.00 WIB, hari libur: 11.00 – 20.00 WIB",
        "Senin- Sabtu (8.00 – 17.00 WIB)",
        "06.00 – 21.00 WIB",
        "08.00 – 18.00 WIB",
        "24 jam"
    )

    private val ticketPrices = arrayOf(
        "-",
        "-",
        "Dewasa: Rp 12.000,00 – Anak-anak: Rp 6.000,00",
        "Rp 10.000 – Rp 70.000 (sesuai wahana dan paket)",
        "Rp 45.000,00 / hari",
        "Dewasa (Rp 60.000,00) – Anak-anak (Rp 50.000,00)",
        "Rp 2.000,00 / orang",
        "06.00 – 21.00 WIB",
        "Senin – Jumat (Rp 20.000,00), Sabtu – Minggu (Rp 50.000,00)",
        "-"
    )

    private val imageHeaders = arrayOf(
        R.drawable.curug_parigi_1,
        R.drawable.danau_cibeureum,
        R.drawable.taman_buaya_1,
        R.drawable.rumah_pohon_jatiasih_1,
        R.drawable.bumi_perkemahan_karang_kirti_1,
        R.drawable.snow_world_1,
        R.drawable.gedung_juang_45_1,
        R.drawable.saung_ranggon_1,
        R.drawable.venetian_water_carnaval_1,
        R.drawable.pantai_mekar_1
    )

    val listData: ArrayList<TourismPlace>
        get() {
            val list = arrayListOf<TourismPlace>()
            for (position in names.indices) {
                val tourismPlace = TourismPlace()
                tourismPlace.name = names[position]
                tourismPlace.desc = descriptions[position]
                tourismPlace.location = locations[position]
                tourismPlace.operationHour = operationHours[position]
                tourismPlace.ticketPrice = ticketPrices[position]
                tourismPlace.imageHeader = imageHeaders[position]
            }

            return list
        }
}