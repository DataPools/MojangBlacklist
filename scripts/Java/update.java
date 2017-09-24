package updateblacklist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class UpdateBlacklist {

	public static void main(String[] args) throws IOException {
		String domains = "arkhamnetwork.org mc.arkhamnetwork.org play.arkhamnetwork.org playmc.mx primemc.org play.primemc.org muxcraft.eu minetime.com mntm.com luckyprison.com play.luckyprison.com meepcraft.com itsjerryandharry.com play.itsjerryandharry.com ecocitycraft.com mc.ecocitycraft.com play.ecocitycraft.com eccgamers.com mc.eccgamers.com play.eccgamers.com aemservers.net mc.aemservers.net play.aemservers.net cosmicpvp.com play.manacube.com mc.minevast.com yaymc.com crymc.com playhypixel.net skyblocky.com mc.skyblocky.com opjails.com opjails.org minecraft-multiplayer.com play.gotpvp.com factions.xxx pvp.desteria.com";
		 String[] individualdomains = domains.split("\\s"); 
		 for(String w:individualdomains) {
			 BufferedReader in = new BufferedReader(new InputStreamReader(new URL("http://use.gameapis.net/mc/extra/blockedservers/check/"+w).openConnection().getInputStream(), "UTF-8"));
			 String inputLine;
	            StringBuilder a = new StringBuilder();
	            while ((inputLine = in.readLine()) != null)
	                a.append(inputLine+"\n");
	            in.close();
	            System.out.println(a.toString());
	            System.out.println("-------------------------------------------------");
	      }  
		 

	}

}
