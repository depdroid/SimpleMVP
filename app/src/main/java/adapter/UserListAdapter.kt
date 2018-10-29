package adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dicodingindepe.simplemvp.R
import com.dicodingindepe.simplemvp.model.User
import kotlinx.android.synthetic.main.user_item.view.*


class UserListAdapter(var data: MutableList<User>,
                     private val f:(UserListAdapter) -> Unit) : RecyclerView.Adapter<UserListAdapter.UserViewHolder>() {

    private lateinit var holder: UserViewHolder


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): UserViewHolder {

        val mInflater = LayoutInflater.from(p0.context)
        val view = mInflater.inflate(R.layout.user_item, p0, false)
        holder = UserViewHolder(view)
        f(this)
        return holder
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(p0: UserViewHolder, p1: Int) {

        val user = data[p1]
        return p0.setData(user)

    }



    fun setViewClick(viewListener: View.OnClickListener){
        holder.setViewClick(viewListener)
    }

    fun setButtonClick(buttonListener:View.OnClickListener){
        holder.setButtonClick(buttonListener)
    }

    class UserViewHolder(val view: View
                        ) : RecyclerView.ViewHolder(view) {
        private val tvName = view.tvName
        private  val tvAddress = view.tvAdress
        fun setData(user: User) {
            tvName.text = user.name
            tvAddress.text = user.address
        }

        fun setViewClick(viewItemListener:View.OnClickListener){
            view.setOnClickListener(viewItemListener)
        }

        fun setButtonClick(buttonClickListener: View.OnClickListener){
            view.button.setOnClickListener(buttonClickListener)
        }
    }
}




