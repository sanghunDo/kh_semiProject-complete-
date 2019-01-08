package semi.board.rank.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class Rank implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int playno;
	private String gameId;
	private long gameruntime;
	private Date gameescapedate;
	
	public Rank() {}

	public Rank(int playno, String gameId, long gameruntime, Date gameescapedate) {
		this.playno = playno;
		this.gameId = gameId;
		this.gameruntime = gameruntime;
		this.gameescapedate = gameescapedate;
	}

	public int getPlayno() {
		return playno;
	}

	public void setPlayno(int playno) {
		this.playno = playno;
	}

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public long getGameruntime() {
		return gameruntime;
	}

	public void setGameruntime(long gameruntime) {
		this.gameruntime = gameruntime;
	}

	public Date getGameescapedate() {
		return gameescapedate;
	}

	public void setGameescapedate(Date gameescapedate) {
		this.gameescapedate = gameescapedate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Rank [playno=" + playno + ", gameId=" + gameId + ", gameruntime=" + gameruntime + ", gameescapedate="
				+ gameescapedate + "]";
	}
}