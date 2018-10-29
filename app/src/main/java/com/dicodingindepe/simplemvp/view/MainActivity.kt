package com.dicodingindepe.simplemvp.view

import adapter.UserListAdapter
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.dicodingindepe.simplemvp.R
import com.dicodingindepe.simplemvp.model.User
import com.dicodingindepe.simplemvp.presenter.MainPresenter
import com.dicodingindepe.simplemvp.utils.ApiRepository
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.user_item.*
import kotlinx.android.synthetic.main.user_item.view.*
import org.jetbrains.anko.find
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity(), MainView {

    private val users: MutableList<User> = arrayListOf()
    private lateinit var adapter: UserListAdapter
    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()

        presenter.getUserData()
    }

    private fun initData() {

        adapter = UserListAdapter(users) { adapter ->
            adapter.setViewClick(View.OnClickListener {
                startActivity<DetailActivity>("name" to it.tvName.text.toString())
            })
            adapter.setButtonClick(View.OnClickListener {
                val parent = (it.parent as LinearLayout)
                val tvName = parent.find<TextView>(R.id.tvName)

              presenter.removeUser(tvName.text.toString())
            })
        }
        rvUsers.layoutManager = LinearLayoutManager(this)

        rvUsers.adapter = adapter


        val apiRepository = ApiRepository()
        presenter = MainPresenter(this, apiRepository)

    }



    override fun showUserList(data: List<User>) {
        adapter.data.clear()
        adapter.data.addAll(data)
        adapter.notifyDataSetChanged()
    }
}
