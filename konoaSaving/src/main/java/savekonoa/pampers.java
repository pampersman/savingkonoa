package savekonoa;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class pampers extends JavaPlugin {
    @Override
    public void onEnable(){

      getLogger().info("Hello World");

    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
       Player player = (Player) sender;
       player.chat("/title @a title {\"text\":\"\\u3053\\u306e@\\u3042 \\u3092\\u6551\\u3044\\u305f\\u3044\"}" );
       player.chat("この大好き");
       player.sendMessage("<Damitomo0106>このぉおおおおおお");
       player.sendMessage("<jadm876>大丈夫？話聞こか？");
       player.sendMessage("<5don>おやおや。このさん。垢消しはまだはやいですよ。");
       player.sendMessage("<YOSHIKO__chan__>このがいなくなったら本当はさみしいぞ！");
       player.sendMessage("<kakikama>垢消し、だめ！");
       player.sendMessage("<natsu5515>このって言ったら50人クラフトのアイドルみたいなもんですからねー。垢消しはちょっとねー。世間は許してくrえゃすぇんよ");
       player.sendMessage("<Bro_Banana>Hey,bro!");
       player.sendMessage("<Bro_gorillabbit>What's up bro!!");
       player.sendMessage("<imo64>このちゃん大好き");
       player.sendMessage("<eru_java>/pardon negi556");
       player.sendMessage("<rnojaja>いじめ、しない");
       player.sendMessage("<Nishito_31>スパチャしたるで");
       player.sendMessage("<takasou>はっはっはーこのは私が救う！");
       player.sendMessage("<INKYATENSEI>このが！俺を引きずりおろそうとしている！！");
       player.sendMessage("<Deponn>でぽっ");
       player.sendMessage("<RETEN_0831>つーわする？");
       player.sendMessage("<suzuki2929>みんながついてますよ");
       player.sendMessage("<puuyq>kono_a 200IQ lol");
       player.sendMessage("<gm9>不適切な発言がありましたことを、ここにお詫びいたします。");
       player.sendMessage("<Nagatuki>このちゃん大好き");
       player.sendMessage("<Ebifly18>あがっちゃってる？");
       player.sendMessage("<yukimura0325>この大好きだにょー");
       player.sendMessage("<kuramochi4649>このちゃん大好き");
       player.sendMessage("<potechi3710>このちゃん、どうかしたんだべか？");
       player.sendMessage("<ZafTes>となりのあの子はこの");
       player.sendMessage("<ms94>このちゃん大好き");
       player.sendMessage("<uminya_>これだけの人数がいるんだ。もう垢消しなんてしないだろう。");
       player.sendMessage("<kaijuu_san>このちゃん大好き");
       player.sendMessage("<famas1219>好きだぞ。この。");


        return true;
    }

    @Override
    public void onDisable(){

    }
}
