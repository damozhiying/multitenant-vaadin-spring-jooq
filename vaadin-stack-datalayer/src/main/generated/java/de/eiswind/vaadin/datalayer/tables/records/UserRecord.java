/**
 * This class is generated by jOOQ
 */
package de.eiswind.vaadin.datalayer.tables.records;


import de.eiswind.vaadin.datalayer.tables.User;
import de.eiswind.vaadin.datalayer.tables.interfaces.IUser;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRecord extends UpdatableRecordImpl<UserRecord> implements Record4<Long, String, String, Boolean>, IUser {

	private static final long serialVersionUID = -26599650;

	/**
	 * Setter for <code>master.user.id</code>.
	 */
	@Override
	public void setId(Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>master.user.id</code>.
	 */
	@NotNull
	@Override
	public Long getId() {
		return (Long) getValue(0);
	}

	/**
	 * Setter for <code>master.user.user_name</code>.
	 */
	@Override
	public void setUserName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>master.user.user_name</code>.
	 */
	@NotNull
	@Size(max = 255)
	@Override
	public String getUserName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>master.user.password_hash</code>.
	 */
	@Override
	public void setPasswordHash(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>master.user.password_hash</code>.
	 */
	@NotNull
	@Size(max = 2048)
	@Override
	public String getPasswordHash() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>master.user.active</code>.
	 */
	@Override
	public void setActive(Boolean value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>master.user.active</code>.
	 */
	@NotNull
	@Override
	public Boolean getActive() {
		return (Boolean) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Long> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Long, String, String, Boolean> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Long, String, String, Boolean> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return User.USER.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return User.USER.USER_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return User.USER.PASSWORD_HASH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field4() {
		return User.USER.ACTIVE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getUserName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getPasswordHash();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value4() {
		return getActive();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value1(Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value2(String value) {
		setUserName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value3(String value) {
		setPasswordHash(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value4(Boolean value) {
		setActive(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord values(Long value1, String value2, String value3, Boolean value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IUser from) {
		setId(from.getId());
		setUserName(from.getUserName());
		setPasswordHash(from.getPasswordHash());
		setActive(from.getActive());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IUser> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UserRecord
	 */
	public UserRecord() {
		super(User.USER);
	}

	/**
	 * Create a detached, initialised UserRecord
	 */
	public UserRecord(Long id, String userName, String passwordHash, Boolean active) {
		super(User.USER);

		setValue(0, id);
		setValue(1, userName);
		setValue(2, passwordHash);
		setValue(3, active);
	}
}
