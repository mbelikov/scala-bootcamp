package com.evolution.repository

import com.evolution.domain._

class UserRepository extends AbstractRepository {
  def userById(id: UserId): Option[User] = None
  def userPermissions(id: UserId): List[Permission] = Nil
  def userGroups(id: UserId): List[Group] = Nil

  def addUser(value: User): Unit = ()
  def deleteUser(value: User): Unit = ()

  def addPermission(value: Permission): Unit = ()
  def deletePermission(value: Permission): Unit = ()

  def addGroup(value: Group): Unit = ()
  def deleteGroup(value: Group): Unit = ()

  def casinoUsersCount(casinoId: CasinoId): Int = 0
}

/*

class GroupRepository extends AbstractRepository {
  def addGroup(value: Group): Unit = ()
  def deleteGroup(value: Group): Unit = ()
}

class PermissionRepository extends AbstractRepository {
  def addPermission(value: Permission): Unit = ()
  def deletePermission(value: Permission): Unit = ()
}

 */
