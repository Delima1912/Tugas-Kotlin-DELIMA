package id.infinitelearning.KotlinSubmission.exercise5

fun main() {

    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */


    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     *
     */
    var firsName: String = "Astutik"
    var age = "23"

    println()

    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *
     */
    data class Profile(
        val group: Int,
        val jalan: Int,
        val lari: Int,
        val makan: Int,
        val minum: Int,
        val lompat: Int,
        val duduk: Int
    )

    fun main() {
        val profiles = listOf(
            Profile(1, 5, 2, 3, 1, 3, 1),
            Profile(2, 2, 2, 1, 3, 1, 2),
            Profile(3, 3, 1, 5, 1, 5, 3),
            Profile(4, 5, 4, 4, 4, 3, 2),
            Profile(5, 4, 1, 3, 5, 5, 3),
            Profile(6, 2, 4, 2, 2, 7, 4)
        )

        for (profile in profiles) {
            println("Group ${profile.group}:")
            println("Jalan ${profile.jalan}x, Lari ${profile.lari}x, Makan ${profile.makan}x, Minum ${profile.minum}x, Lompat ${profile.lompat}x, Duduk ${profile.duduk}x")
            println()
        }


        /**
        Challenge:
        Group 1: jalan 5x, lari 2x, makan 3x, minum 1x, lompat 3x, duduk 1x
        Group 2: jalan 2x, lari 2x, makan 1x, minum 3x, lompat 1x, duduk 2x
        Group 3: jalan 3x, lari 1x, makan 5x, minum 1x, lompat 5x, duduk 3x
        Group 4: jalan 5x, lari 4x, makan 4x, minum 4x, lompat 3x, duduk 2x
        Group 5: jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x
        Group 6: jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x
         **/

        /**
         * Latihan 4
         * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
         *
         */
        fun jalan(jumlah: Int) {
            for (i in 1..jumlah) {
                println("Jalan")
            }
        }

        fun lari(jumlah: Int) {
            for (i in 1..jumlah) {
                println("Lari")
            }
        }

        fun makan(jumlah: Int) {
            for (i in 1..jumlah) {
                println("Makan")
            }
        }

        fun minum(jumlah: Int) {
            for (i in 1..jumlah) {
                println("Minum")
            }
        }

        fun lompat(jumlah: Int) {
            for (i in 1..jumlah) {
                println("Lompat")
            }
        }

        fun duduk(jumlah: Int) {
            for (i in 1..jumlah) {
                println("Duduk")
            }
        }

            println("Group 1:")
            jalan(5)
            lari(2)
            makan(3)
            minum(1)
            lompat(3)
            duduk(1)

            println("Group 2:")
            jalan(2)
            lari(2)
            makan(1)
            minum(3)
            lompat(1)
            duduk(2)

            println("Group 3:")
            jalan(3)
            // Tidak ada fungsi "Lari Ix" yang ditentukan, mungkin ada kesalahan penulisan
            makan(5)
            minum(1)
            lompat(5)
            duduk(3)

            println("Group 4:")
            // "jalon" mungkin merupakan kesalahan penulisan, diganti menjadi "jalan"
            jalan(5)
            lari(4)
            makan(4)
            minum(4)
            lompat(3)
            duduk(2)

            println("Group 5:")
            jalan(4)
            lari(1)
            makan(3)
            minum(5)
            lompat(5)
            duduk(3)

            println("Group 6:")
            // "jotan" mungkin merupakan kesalahan penulisan, diganti menjadi "jalan"
            jalan(2)
            lari(4)
            makan(2)
            minum(2)
            lompat(7)
            duduk(4)





        /**
         * Latihan 5
         * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
         *
         */

        fun setProfile(activity: String, count: Int) {
            println("Melakukan aktivitas $activity sebanyak $count kali")
        }

        fun main() {
            println("Group 1:")
            setProfile("Jalan", 5)
            setProfile("Lari", 2)
            setProfile("Makan", 3)
            setProfile("Minum", 1)
            setProfile("Lompat", 3)
            setProfile("Duduk", 1)

            println("Group 2:")
            setProfile("Jalan", 2)
            setProfile("Lari", 2)
            setProfile("Makan", 1)
            setProfile("Minum", 3)
            setProfile("Lompat", 1)
            setProfile("Duduk", 2)

            println("Group 3:")
            setProfile("Jalan", 3)
            // Tidak ada aktivitas "Lari Ix", mungkin ada kesalahan penulisan
            setProfile("Makan", 5)
            setProfile("Minum", 1)
            setProfile("Lompat", 5)
            setProfile("Duduk", 3)

            println("Group 4:")
            // "jalon" mungkin merupakan kesalahan penulisan, diganti menjadi "jalan"
            setProfile("Jalan", 5)
            setProfile("Lari", 4)
            setProfile("Makan", 4)
            setProfile("Minum", 4)
            setProfile("Lompat", 3)
            setProfile("Duduk", 2)

            println("Group 5:")
            setProfile("Jalan", 4)
            setProfile("Lari", 1)
            setProfile("Makan", 3)
            setProfile("Minum", 5)
            setProfile("Lompat", 5)
            setProfile("Duduk", 3)

            println("Group 6:")
            // "jotan" mungkin merupakan kesalahan penulisan, diganti menjadi "jalan"
            setProfile("Jalan", 2)
            setProfile("Lari", 4)
            setProfile("Makan", 2)
            setProfile("Minum", 2)
            setProfile("Lompat", 7)
            setProfile("Duduk", 4)
        }

    }
}