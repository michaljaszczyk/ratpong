/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.pongi.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.example.gradle.db.pongi.tables.Scorecord;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ScorecordRecord extends UpdatableRecordImpl<ScorecordRecord> implements Record5<String, Byte, Integer, Integer, String> {

	private static final long serialVersionUID = 1709349868;

	/**
	 * Setter for <code>pongi.SCORECORD.user</code>.
	 */
	public void setUser(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>pongi.SCORECORD.user</code>.
	 */
	public String getUser() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>pongi.SCORECORD.won</code>.
	 */
	public void setWon(Byte value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>pongi.SCORECORD.won</code>.
	 */
	public Byte getWon() {
		return (Byte) getValue(1);
	}

	/**
	 * Setter for <code>pongi.SCORECORD.scoredPoint</code>.
	 */
	public void setScoredpoint(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>pongi.SCORECORD.scoredPoint</code>.
	 */
	public Integer getScoredpoint() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>pongi.SCORECORD.lostPoint</code>.
	 */
	public void setLostpoint(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>pongi.SCORECORD.lostPoint</code>.
	 */
	public Integer getLostpoint() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>pongi.SCORECORD.gameID</code>.
	 */
	public void setGameid(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>pongi.SCORECORD.gameID</code>.
	 */
	public String getGameid() {
		return (String) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<String, String> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<String, Byte, Integer, Integer, String> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<String, Byte, Integer, Integer, String> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return Scorecord.SCORECORD.USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field2() {
		return Scorecord.SCORECORD.WON;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return Scorecord.SCORECORD.SCOREDPOINT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return Scorecord.SCORECORD.LOSTPOINT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Scorecord.SCORECORD.GAMEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getUser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value2() {
		return getWon();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getScoredpoint();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getLostpoint();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getGameid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ScorecordRecord value1(String value) {
		setUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ScorecordRecord value2(Byte value) {
		setWon(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ScorecordRecord value3(Integer value) {
		setScoredpoint(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ScorecordRecord value4(Integer value) {
		setLostpoint(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ScorecordRecord value5(String value) {
		setGameid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ScorecordRecord values(String value1, Byte value2, Integer value3, Integer value4, String value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ScorecordRecord
	 */
	public ScorecordRecord() {
		super(Scorecord.SCORECORD);
	}

	/**
	 * Create a detached, initialised ScorecordRecord
	 */
	public ScorecordRecord(String user, Byte won, Integer scoredpoint, Integer lostpoint, String gameid) {
		super(Scorecord.SCORECORD);

		setValue(0, user);
		setValue(1, won);
		setValue(2, scoredpoint);
		setValue(3, lostpoint);
		setValue(4, gameid);
	}
}