package org.mis.bean;

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Studenttable entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see org.mis.bean.Studenttable
 * @author MyEclipse Persistence Tools
 */
public class StudenttableDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(StudenttableDAO.class);

	// property constants

	public void save(Studenttable transientInstance) {
		log.debug("saving Studenttable instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Studenttable persistentInstance) {
		log.debug("deleting Studenttable instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Studenttable findById(org.mis.bean.StudenttableId id) {
		log.debug("getting Studenttable instance with id: " + id);
		try {
			Studenttable instance = (Studenttable) getSession().get(
					"org.mis.bean.Studenttable", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Studenttable instance) {
		log.debug("finding Studenttable instance by example");
		try {
			List results = getSession()
					.createCriteria("org.mis.bean.Studenttable")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Studenttable instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Studenttable as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Studenttable instances");
		try {
			String queryString = "from Studenttable";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Studenttable merge(Studenttable detachedInstance) {
		log.debug("merging Studenttable instance");
		try {
			Studenttable result = (Studenttable) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Studenttable instance) {
		log.debug("attaching dirty Studenttable instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Studenttable instance) {
		log.debug("attaching clean Studenttable instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}