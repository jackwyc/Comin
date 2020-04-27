package jwychoi.practice.comin.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import jwychoi.practice.comin.Fragment.MarketInfo.MarketInfoActivity
import jwychoi.practice.comin.R
import kotlinx.android.synthetic.main.fragment_first.view.*

/**
 * A simple [Fragment] subclass.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view : View = inflater.inflate(R.layout.fragment_first, container, false)

        val list_array = arrayListOf<ContentsListModel>(

            ContentsListModel("a", "b", 1, "c"),
            ContentsListModel("a", "z", 1, "c"),
            ContentsListModel("a", "q", 1, "c"),
            ContentsListModel("a", "g", 1, "c"),
            ContentsListModel("a", "r", 1, "c"),
            ContentsListModel("a", "d", 1, "c"),
            ContentsListModel("a", "r", 1, "c")

        )

        val list_adpter = FirstFragAdapter(requireContext(), list_array)
        view.listview_first_fragment.adapter = list_adpter

        view.listview_first_fragment.setOnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(requireContext(), MarketInfoActivity::class.java)
            startActivity(intent)
        }

        return view
    }

}
